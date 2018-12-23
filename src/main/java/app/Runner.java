package app;

import com.sun.istack.internal.NotNull;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Runner {

    private static class HelloScriptingWorld {

    }

    public static void main(@NotNull String[] args) throws ScriptException, NoSuchMethodException {

        ScriptEngineManager scriptEngineMgr = new ScriptEngineManager();
        ScriptEngine jsEngine = scriptEngineMgr.getEngineByName("JavaScript");

        if (jsEngine != null) {

            System.out.println("Вызываем invokeHelloScript...");
            invokeHelloScript(jsEngine);

            System.out.println("\nВызываем defineScriptFunction...");
            defineScriptFunction(jsEngine);

            System.out.println("\nВызываем invokeScriptFunctionFromEngine...");
            invokeScriptFunctionFromEngine(jsEngine);

            System.out.println("\nВызываем invokeScriptFunctionFromJava...");
            invokeScriptFunctionFromJava(jsEngine);

            System.out.println("\nВызываем invokeJavaFromScriptFunction...");
            invokeJavaFromScriptFunction(jsEngine);


        } else {
            System.err.println("JavaScript engines not found!");
            System.exit(1);
        }


        for (String str : args) {
            System.out.printf("%s\t", str);
        }
    }

    private static void invokeHelloScript(@NotNull ScriptEngine jsEngine) throws ScriptException {
        jsEngine.eval("println('Hello from JavaScript')");
    }

    private static void defineScriptFunction(@NotNull ScriptEngine engine) throws ScriptException {
        // Define a function in the script engine
        engine.eval(
                "function sayHello(name) {" +
                        "    println('Hello, ' + name)" +
                        "}"
        );
    }

    private static void invokeScriptFunctionFromEngine(@NotNull ScriptEngine engine)
            throws ScriptException
    {
        engine.eval("sayHello('World!')");
    }

    private static void invokeScriptFunctionFromJava(ScriptEngine engine)
            throws ScriptException, NoSuchMethodException
    {
        Invocable invocableEngine = (Invocable) engine;
        invocableEngine.invokeFunction("sayHello", "from Java");
    }

    private static void invokeJavaFromScriptFunction(ScriptEngine engine)
            throws ScriptException
    {
        engine.put("helloScriptingWorld", new HelloScriptingWorld());
        engine.eval(
                "println('Вызываем метод getHelloReply из JavaScript...');" +
                        "var msg = helloScriptingWorld.getHelloReply(vJavaScript');" +
                        "println('Получили из Java: ' + msg)"
        );
    }

    /** Метод, вызываемый из вышеприведенного скрипта и возвращающий строку. */
    public String getHelloReply(String name) {
        return "Java-метод getHelloReply говорит 'Привет, " + name + "'";
    }
}

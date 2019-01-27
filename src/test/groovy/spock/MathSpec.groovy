package spock

import app.Runner
import spock.lang.Specification as SpockSpec

class MathSpec extends SpockSpec{

    final SRC_STR_INT_ARR = ["12", "0", "4", "56", "78789", "10", "11"]

    final DST_EVEN_INT_ARR = [12, 0, 4, 56, 10]
    final DST_ODD_INT_ARR = [78789, 11]

    final DST_MAX_INT = 78789
    final DST_MIN_INT = 0

    def "получение всех четных чисел из строкового массива целых чисел"() {

        given: ""
        when:  ""
        def src = SRC_STR_INT_ARR
        def dst = DST_EVEN_INT_ARR
        then:  ""
        Runner.Math.even(src as String[]) == dst as int[]
        println "src $src"
        println "dst $dst"
    }
    def "получение всех нечетных чисел из строкового массива целых чисел"() {

        given: ""
        when:  ""
        def src = SRC_STR_INT_ARR
        def dst = DST_ODD_INT_ARR
        then:  ""
        Runner.Math.odd(src as String[]) == dst as int[]
    }
    def "получение максимального целого числа из строкового массива целых чисел"() {
        given: ""
        when:  "получаем строковый массив целых чисел"
        def src = SRC_STR_INT_ARR
        def dst = DST_MAX_INT
        then:  "получение максимального целого числа из строкового массива целых чисел"
        Runner.Math.max(src as String[]) == dst
    }
    def "получение минимального целого числа из строкового массива целых чисел"() {
        given: ""
        when:  "получаем строковый массив целых чисел"
        def src = SRC_STR_INT_ARR
        def dst = DST_MIN_INT
        then:  "получение минимального целого числа из строкового массива целых чисел"
        Runner.Math.min(src as String[]) == dst
    }
}

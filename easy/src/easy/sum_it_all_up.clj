(ns easy.sum-it-all-up)

;; Sum It All Up
;; Problem: Write a function which returns the sum of a sequence of numbers.
;; Examples:
;;          (= (__ [1 2 3]) 6)
;;          (= (__ (list 0 -2 5 5)) 8)
;;          (= (__ #{4 2 1}) 7)
;;          (= (__ '(0 0 -1)) -1)
;;          (= (__ '(1 10 3)) 14)


(defn sum-up [s]
  (reduce + s))

;; Unit Test
(def first-test [1 2 3])
(def second-test (list 0 -2 5 5))
(def third-test #{4 2 1})
(def fourth-test '(0 0 -1))
(def fifth-test '(1 10 3))

(println "1st. test:" (sum-up first-test))
(println "2nd. test:" (sum-up second-test))
(println "3rd. test:" (sum-up third-test))
(println "4th. test:" (sum-up fourth-test))
(println "5th. test:" (sum-up fifth-test))

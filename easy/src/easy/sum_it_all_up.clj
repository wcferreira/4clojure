(ns easy.sum-it-all-up)

(def first-test [1 2 3])
(def second-test (list 0 -2 5 5))
(def third-test #{4 2 1})
(def fourth-test '(0 0 -1))
(def fifth-test '(1 10 3))

(defn sum-up [s]
  (reduce + s))


(println "1st. test:" (sum-up first-test))
(println "2nd. test:" (sum-up second-test))
(println "3rd. test:" (sum-up third-test))
(println "4th. test:" (sum-up fourth-test))
(println "5th. test:" (sum-up fifth-test))

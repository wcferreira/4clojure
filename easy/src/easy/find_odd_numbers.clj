(ns easy.find-odd-numbers)

(def first-test #{1 2 3 4 5})
(def second-test [4 2 1 6])
(def third-test [2 2 4 6])
(def fourth-test [1 1 1 3])

(defn find-odd-numbers [s]
  (filter odd? s))

(println "1st. test:" (find-odd-numbers first-test))
(println "2nd. test:" (find-odd-numbers second-test))
(println "3rd. test:" (find-odd-numbers third-test))
(println "4th. test:" (find-odd-numbers fourth-test))

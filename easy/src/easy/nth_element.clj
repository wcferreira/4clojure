(ns easy.nth-element)

;; Nth Element
;; Problem: Write a function which returns the Nth element from a sequence.
;; Examples:
;;          (= (__ '(4 5 6 7) 2) 6)
;;          (= (__ [:a :b :c] 0) :a)
;;          (= (__ [1 2 3 4] 1) 2)
;;          (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])l




(defn get-nth [s index]
  (let [myseq s]
    (first (drop index myseq))))



;; Unit Test
(def first-seq '(4 5 6))
(def second-seq [:a :b :c])
(def third-seq [1 2 3])
(def fourth-seq '([1 2] [3 4] [5 6]))

(println (get-nth first-seq 2))
(println (get-nth second-seq 0))
(println (get-nth third-seq 1))
(println (get-nth fourth-seq 2))

(ns easy.nth-element)

(def first-seq '(4 5 6))
(def second-seq [:a :b :c])
(def third-seq [1 2 3])
(def fourth-seq '([1 2] [3 4] [5 6]))


(defn get-nth [s index]
  (let [myseq s]
    (first (drop index myseq))))

(println (get-nth first-seq 2))
(println (get-nth second-seq 0))
(println (get-nth third-seq 1))
(println (get-nth fourth-seq 2))

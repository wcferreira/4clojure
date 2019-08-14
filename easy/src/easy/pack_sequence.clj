(ns easy.pack-sequence)



;; Pack a Sequence
;; Problem: Write a function which packs consecutive duplicates into sub-lists.
;; Examples:
;;          (= (__ [1 1 2 1 1 1 3 3]) '((1 1) (2) (1 1 1) (3 3)))
;;          (= (__ [:a :a :b :b :c]) '((:a :a) (:b :b) (:c)))
;;          (= (__ [[1 2] [1 2] [3 4]]) '(([1 2] [1 2]) ([3 4])))


(defn pack-seq [s]
  (loop [coll [] myseq s]
    (if (empty? myseq)
      coll
      (recur
        (conj coll (take-while #(= % (first myseq)) myseq))
        (drop-while #(= % (first myseq)) myseq)))))
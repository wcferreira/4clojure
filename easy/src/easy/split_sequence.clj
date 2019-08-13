(ns easy.split-sequence)

;; Split a sequence
;; Problem: Write a function which will split a sequence into two parts.
;; Examples:
;;          (= (__ 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
;;          (= (__ 1 [:a :b :c :d]) [[:a] [:b :c :d]])
;;          (= (__ 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])

(defn split-seq [n s]
  (let [coll (conj [] (subvec s 0 n))]
        (conj coll (subvec s n))))
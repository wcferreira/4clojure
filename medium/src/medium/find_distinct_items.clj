(ns medium.find-distinct-items)

;; Find Distinct Items
;; Problem: Write a function which removes the duplicates from a sequence.
;;          Order of the items must be maintained.
;; Examples:
;;          (= (__ [1 2 1 3 1 2 4]) [1 2 3 4])
;;          (= (__ [:a :a :b :b :c :c]) [:a :b :c])
;;          (= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
;;          (= (__ (range 50)) (range 50))

(defn find-dist [coll]
  (loop [myset (sorted-set) mycoll coll]
    (if (empty? mycoll)
      (seq myset)
      (recur
        (conj myset (first mycoll))
        (rest mycoll)))))

(ns medium.count-ocurrences)
;; Count Occurrences
;; Problem: Write a function which returns a map containing the number of occurences
;;          of each distinct item in a sequence.
;; Examples:
;;          (= (__ [1 1 2 3 2 1 1]) {1 4, 2 2, 3 1})
;;          (= (__ [:b :a :b :a :b]) {:a 2, :b 3})
;;          (= (__ '([1 2] [1 3] [1 3])) {[1 2] 1, [1 3] 2})

(defn count-ocur [coll]
  (loop [mymap {} mycoll coll]
    (if (empty? mycoll)
      mymap
      (let [result (if (contains? mymap (first mycoll))
                     (vector (first mycoll) (inc (get mymap (first mycoll))))
                     (vector (first mycoll) 1))]
        (recur
          (assoc mymap (first result) (last result))
          (rest mycoll))))))

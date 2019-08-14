(ns easy.symmetric-difference)

;; Symmetric Difference
;; Problem:  Write a function which returns the symmetric difference of two sets. The symmetric difference is the set of items belonging to one but not both of the two sets.
;; Examples:
;;          (= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
;;          (= (__ #{:a :b :c} #{}) #{:a :b :c})
;;          (= (__ #{} #{4 5 6}) #{4 5 6})
;;          (= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})

(defn sym-diff [s1 s2]
  (let [r1   (reduce
               (fn [c e]
                 (if (contains? s2 e)
                   c
                   (conj c e))) #{} s1)
        r2    (reduce
                (fn [c e]
                  (if (contains? s1 e)
                    c
                    (conj c e))) #{} s2)
        r3 (clojure.set/union r1 r2)
        ]
    r3))



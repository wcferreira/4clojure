(ns easy.interpose-seq)


;; Interpose a Seq
;; Problem: Write a function which separates the items of a sequence by an arbitrary value.
;; Examples:
;;          (= (__ 0 [1 2 3]) [1 0 2 0 3])
;;          (= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
;;          (= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])

(defn interpose-seq [sep s]
  (let [result
          (reduce
            (fn [coll elm]
              (conj coll elm sep)) [] s)
        ]
    (if (string? (first s))
      (->> (butlast result)
           (flatten)
           (reduce concat)
           (clojure.string/join ""))
      (butlast result))))

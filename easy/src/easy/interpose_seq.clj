(ns easy.interpose-seq)


;(defn interpose-seq [sep s]
;    (reduce
;      (fn [coll elm]
;        (conj coll elm sep)) [] s))


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

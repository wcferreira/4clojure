(ns easy.compress-sequence)

;(defn compress-seq [s]
;  (reduce
;    (fn [coll elm]
;      (if (not= (last coll) elm)
;        (conj coll elm)
;        coll)) [] s))

(defn compress-seq [s]
  (let [result
        (reduce
           (fn [coll elm]
             (if (not= (last coll) elm)
               (conj coll elm) coll)) [] s)
        ]
    (if (string? s)
      (clojure.string/join "" result)
      result)))

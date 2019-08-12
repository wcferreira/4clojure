(ns easy.compress-a-sequence)

;(defn compress-sequence [s]
;  (let [result (reduce conj (sorted-set) s)]
;    (if (string? s)
;      result
;      result)))


(defn compress-sequence [s]
  (reduce
    (fn [coll elm]
      (if (some #(= % elm) coll)
        coll
        (conj coll elm))) [] s))





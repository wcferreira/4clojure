(ns easy.maximum-value)


(defn greater [a b]
  (if (> a b)
    a
    b))


(defn get-max-val [& more]
  (reduce #(Math/max %1 %2)  more))


(defn get-max-val2 [& more]
  (reduce (fn [a b]
            (if (> a b) a b)) more))

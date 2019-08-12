(ns easy.half-true)

;(defn half-true [& more]
;  (reduce #(or %1 %2) true more))

(defn half-true? [& more]
  (if (every? true? more)
    false
    (reduce #(or %1 %2) more)))

(ns easy.maximum-value)

;; Maximum value
;; Problem: Write a function which takes a variable number of parameters and returns the maximum value.
;; Examples:
;;          (= (__ 1 8 3 4) 8)
;;          (= (__ 30 20) 30)
;;          (= (__ 45 67 11) 67)

(defn get-max-val [& more]
  (reduce #(Math/max %1 %2)  more))


;; Another version
;(defn get-max-val [& more]
;  (reduce (fn [a b]
;            (if (> a b) a b)) more))

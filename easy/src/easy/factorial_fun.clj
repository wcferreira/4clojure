(ns easy.factorial-fun)

;; Factorial Fun
;; Problem: Write a function which calculates factorials.
;; Examples:
;;          (= (__ 1) 1)
;;          (= (__ 3) 6)
;;          (= (__ 5) 120)
;;          (= (__ 8) 40320)

(defn factorial-fun [n]
  {:pre [(pos? n)]}
  (reduce * (rest (range (+ n 1)))))


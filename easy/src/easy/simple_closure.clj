(ns easy.simple-closure)

;; Simple closures
;; Problem:  Given a positive integer n, return a function (f x) which computes x pow n.
;; Observe that the effect of this is to preserve the value of n for use outside the scope in which it is defined.
;; Examples:
;;          (= 256 ((__ 2) 16),
;;                 ((__ 8) 2))

;;          (= [1 8 27 64] (map (__ 3) [1 2 3 4]))
;;          (= [1 2 4 8 16] (map #((__ %) 2) [0 1 2 3 4]))

(defn simple-closure [exp]
  (fn [base]
  (reduce * (repeat exp base))))
(ns easy.product-digits)

;; Product Digits
;; Problem: Write a function which multiplies two numbers and returns the result as a sequence of its digits.
;; Examples:
;;          (= (__ 1 1) [1])
;;          (= (__ 99 9) [8 9 1])
;;          (= (__ 999 99) [9 8 9 0 1])


(defn prod-dig [n1 n2]
  (loop [lst () num (* n1 n2)]
    (if (<= num 10)
      (conj lst num)
      (recur
        (conj lst (mod num 10))
        (quot num 10)))))

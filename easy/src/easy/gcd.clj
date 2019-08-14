(ns easy.gcd)

;; Greatest Common Divisor
;; Problem: Given two integers, write a function which returns the greatest common divisor.
;; Examples:
;;          (= (__ 2 4) 2)
;;          (= (__ 10 5) 5)
;;          (= (__ 5 7) 1)
;;          (= (__ 1023 858) 33)

(defn gcd [m n]
  (loop [m m n n]
    (if (zero? (mod m n))
      n
      (recur
        n
        (mod m n)))))


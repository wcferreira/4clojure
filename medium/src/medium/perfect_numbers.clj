(ns medium.perfect-numbers)

;; Perfect Numbers
;; Problem: A number is "perfect" if the sum of its divisors equal the number itself. 6 is a perfect number
;;          because 1+2+3=6. Write a function which returns true for perfect numbers and false otherwise.
;; Examples:
;;          (= (__ 6) true)
;;          (= (__ 7) false)
;;          (= (__ 496) true)
;;          (= (__ 500) false)
;;          (= (__ 8128) true)

;(defn show-divisors-of-n [n]
;  (let [divisors (atom #{1})
;        den (atom 2)]
;    (loop [num n]
;      (if (<= num 1)
;        @divisors
;        (do
;          (let [result (if (zero? (mod num @den)) @den 1)]
;            (if (zero? (mod num @den))
;              (swap! divisors conj @den)
;              (swap! den inc))
;            (recur (quot num result))))))))
;
;
;(defn is-perfect-numbers? [n]
;  (let [divisors (atom #{1})
;        den (atom 2)]
;    (loop [num n]
;      (if (<= num 1)
;        (= (reduce + @divisors) n)
;        (do
;          (let [result (if (zero? (mod num @den)) @den 1)]
;            (if (zero? (mod num @den))
;              (swap! divisors conj @den)
;              (swap! den inc))
;            (recur (quot num result))


(defn is-perfect-number? [num]
  (= num
    (reduce +
            (butlast
              (filter
                (fn [n] (if (zero? (mod num n)) n))
                (range 1 (+ num 1)))))))





(ns medium.digits-and-bases)

;; Digits and bases
;; Problem: Write a function which returns a sequence of digits of a non-negative number (first argument)
;;          in numerical system with an arbitrary base (second argument). Digits should be represented
;;          with their integer values, e.g. 15 would be [1 5] in base 10, [1 1 1 1] in base 2 and [15] in base 16.
;; Examples:
;;          (= [1 2 3 4 5 0 1] (__ 1234501 10))
;;          (= [0] (__ 0 11))
;;          (= [1 0 0 1] (__ 9 2))
;;          (= [1 0] (let [n (rand-int 100000)](__ n n)))
;;          (= [16 18 5 24 15 1] (__ Integer/MAX_VALUE 42))

(defn conv [num base]
  (loop [myvec () num num]
    (if (zero? num)
      (if (empty? myvec)
        [0]
        myvec)
      (recur
        (conj myvec (mod num base))
        (quot num base)))))

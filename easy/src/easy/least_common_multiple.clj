(ns easy.least-common-multiple)

;; Least Common Multiple
;; Problem: Write a function which calculates the least common multiple. Your function should accept a variable number of positive integers or ratios.
;; Examples:
;           (== (__ 2 3) 6)
;           (== (__ 5 3 7) 105)
;           (== (__ 1/3 2/5) 2)
;           (== (__ 3/4 1/6) 3/2)
;           (== (__ 7 5/7 2 3/5) 210)

;; First solution
;(defn lcm
;  ([m n]
;   (loop [fs [m] sc [n]]
;     (let [result (for [x fs y sc :when (=  x y)] x)]
;       (if-not (empty? result)
;         (first result)
;         (recur
;           (conj fs (+ (last fs) m))
;           (conj sc (+ (last sc) n)))))))
;  ([m n o]
;    (lcm m (lcm n o)))
;  ([m n o p]
;   (lcm (lcm m n) (lcm o p))))

;; LCM(a, b) = a * b / gcd (a, b)

;; Second Solution
(defn lcm
  ([a b]
     (let [gcd
               (loop [m a n b]
                 (if (zero? (mod m n))
                   n
                   (recur n (mod m n))))
             result (/ (* a b) gcd)]
       result))
  ([a b c]   (lcm a (lcm b c)))
  ([a b c d] (lcm (lcm a b) (lcm c d))))


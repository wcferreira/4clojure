(ns easy.pascal-triangle)

;; Pascal's Triangle
;; Problem: Write a function which returns the nth row of Pascal's Triangle.
;; Hints:
;;         Pascal's triangle is a triangle of numbers computed using the following rules:
;;         - The first row is 1.
;;         - Each successive row is computed by adding together adjacent numbers in the row above,
;;           and adding a 1 to the beginning and end of the row.


;; Examples
;; (= (__ 1) [1])
;; (= (map __ (range 1 6))
;   [     [1]
;        [1 1]
;       [1 2 1]
;      [1 3 3 1]
;     [1 4 6 4 1]])

;(= (__ 11)
;   [1 10 45 120 210 252 210 120 45 10 1])

;; Pascal Triangle
;; Line #00 1
;; Line #01 1   1
;; Line #02 1   2    1
;; Line #03 1   3    3    1
;; Line #04 1   4    6    4    1
;; Line #05 1   5    10   10   5    1
;; Line #06 1   6    15   20   15   6    1
;; Line #07 1   7    21   35   35   21   7    1
;; Line #08 1   8    28   56   70   56   28   8    1
;; Line #09 1   9    36   84   126  126  84   36   9    1
;; Line #10 1   10   45   120  210  252  210  120  45   10    1

;; Binomio de newton => n ! / p! * (n - p)!
;4 = 4! / (0! * (4 - 0)!)  => 1
;0
;
;4 = 4! / 1! * 3!          => 4
;1
;
;4 = 4! / 2! * 2!          => 6
;2
;
;4 = 4! / 3! * !           => 4
;3
;
;4 = 4! / 4!               => 1
;4

;(defn fat [n]
;  (if (zero? n)
;    1
;    (reduce (fn [x y] (* x y)) (range 1 (+ n 1)))))

;; Binomio de newton => n ! / p! * (n - p)!

;(defn create-pascal-triangle [num]
;  (loop [coll [] line 0]
;    (if (= line num)
;      coll
;      (recur
;        (conj coll (quot (fat num) (* (fat line)  (fat (- num line)))))
;        (inc line)))))



;(defn create-pascal-triangle [n]
;  (let [num (if (number? n) n (first n))
;        fat (fn [n]
;              (if (zero? n)
;                1
;                (reduce (fn [x y] (* x y)) (range 1 (+ n 1)))))]
;
;    (loop [coll [] line 0]
;      (if (= line num)
;        (conj coll 1)
;        (recur
;          (conj coll (quot (fat num) (* (fat line)  (fat (- num line)))))
;          (inc line))))))

(defn create-pascal-triangle [n]
  (let [num (if (number? n) (- n 1)  (- (first n) 1))
        fat (fn [n]
              (if (zero? n)
                1
                (reduce (fn [x y] (* x y)) (range 1 (+ n 1)))))]

    (loop [coll [] line 0]
      (if (= line num)
        (conj coll 1)
        (recur
          (conj coll (quot (fat num) (* (fat line)  (fat (- num line)))))
          (inc line))))))

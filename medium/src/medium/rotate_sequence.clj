(ns medium.rotate-sequence)

;; Rotate Sequence
;; Problem: Write a function which can rotate a sequence in either direction.
;; Examples:
;;          (= (__ 2 [1 2 3 4 5]) '(3 4 5 1 2))
;;          (= (__ -2 [1 2 3 4 5]) '(4 5 1 2 3))
;;          (= (__ 6 [1 2 3 4 5]) '(2 3 4 5 1))
;;          (= (__ 1 '(:a :b :c)) '(:b :c :a))
;;          (= (__ -4 '(:a :b :c)) '(:c :a :b))

(def nums [1 2 3 4 5])

(conj (conj (vec (drop 2 nums)) (first nums)) (second nums))

;(defn rotate-seq [num coll]
;  (loop [new-coll coll cnt 0]
;    (if (< cnt num)
;      (recur
;        (conj (vec (drop 1 new-coll)) (get (vec coll) (mod cnt (count coll))))
;        (inc cnt))
;      (seq new-coll))))

(defn rotate-seq [num coll]
  (let [new-num  (if (neg? num)
                   (+ (* num -1) 1)
                   num)]
    (loop [new-coll coll cnt 0]
      (if (< cnt new-num)
        (recur
          (conj (vec (drop 1 new-coll)) (get (vec coll) (mod cnt (count coll))))
          (inc cnt))
        (seq new-coll)))))
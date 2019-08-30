(ns medium.prime-numbers)

;(defn is-prime? [num]
;  (loop [myprimes #{} cnt num]
;    (if (zero? cnt)
;      (not (> (count (filter #(> % 1) myprimes)) 1))
;      (let [result (if (zero? (mod num cnt)) cnt 0)]
;        (recur
;          (conj myprimes result)
;          (dec cnt))))))


(filter identity (map (fn [n] (if (is-prime? n) n))  (range 2 545)))

(defn get-first-n-primes [num]
  (take num
        (filter
          identity
          (map
            (fn [n] (if ((fn [num]
                           (loop [myprimes #{} cnt num]
                             (if (zero? cnt)
                               (not (> (count (filter #(> % 1) myprimes)) 1))
                               (let [result (if (zero? (mod num cnt)) cnt 0)]
                                 (recur
                                   (conj myprimes result)
                                   (dec cnt)))))) n) n)) (range 2 545)))))


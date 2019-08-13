(ns easy.indexing-sequences)

;; Indexing Sequences
;; Problem: Transform a sequence into a sequence of pairs containing the original elements along with their index.
;; Examples:
;;           (= (__ [:a :b :c]) [[:a 0] [:b 1] [:c 2]])
;;           (= (__ [0 1 3]) '((0 0) (1 1) (3 2)))
;;           (= (__ [[:foo] {:bar :baz}]) [[[:foo] 0] [{:bar :baz} 1]])

(defn index-seq [s]
  (reduce
    (fn [coll elm]
      (conj coll elm)) [] (zipmap s (range (count s)))))


;; Another solution
;(defn index-seq [s]
;  (loop [coll [] cnt 0 ]
;    (if (< cnt (count s))
;      (let [c (conj [] (get s cnt) cnt)]
;        (recur
;          (conj coll c)
;          (inc cnt)))
;      coll)))
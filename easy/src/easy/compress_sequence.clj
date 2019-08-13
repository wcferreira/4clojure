(ns easy.compress-sequence)

;; Compress a Sequence
;; Problem: Write a function which removes consecutive duplicates from a sequence.
;; Examples:
;; ￼        (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
;;          (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
;;          (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))

(defn compress-seq [s]
  (let [result
        (reduce
           (fn [coll elm]
             (if (not= (last coll) elm)
               (conj coll elm) coll)) [] s)
        ]
    (if (string? s)
      (clojure.string/join "" result)
      result)))


;(defn compress-seq [s]
;  (reduce
;    (fn [coll elm]
;      (if (not= (last coll) elm)
;        (conj coll elm)
;        coll)) [] s))

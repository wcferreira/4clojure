(ns easy.removing-items)

;; Drop Every Nth Item
;; Problem: Write a function which drops every Nth item from a sequence.
;; Examples:
;;          (= (__ [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8])
;;          (= (__ [:a :b :c :d :e :f] 2) [:a :c :e])
;;          (= (__ [1 2 3 4 5 6] 4) [1 2 3 5 6])

(defn drop-every-nth [s offset]
  (loop [coll [] local s]
    (if (empty? local)
      (flatten coll)
      (recur
        (->> (take (- offset 1) local)
             (conj coll))
        (drop offset local)))))

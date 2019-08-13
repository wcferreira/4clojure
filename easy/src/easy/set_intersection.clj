(ns easy.set-intersection)

;; Set Intersection
;; Problem: Write a function which returns the intersection of two sets. The intersection is the sub-set of items that each set has in common.
;; Examples:
;;          (= (__ #{0 1 2 3} #{2 3 4 5}) #{2 3})
;;          (= (__ #{0 1 2} #{3 4 5}) #{})
;;          (= (__ #{:a :b :c :d} #{:c :e :a :f :d}) #{:a :c :d})

(defn set-int [s1 s2]
  (into #{}
        (for [x s1
              y s2
              :when (= x y)]
          x)))
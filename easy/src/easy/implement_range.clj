(ns easy.implement-range)

;; Implement range
;; Problem: Write a function which creates a list of all integers in a given range.
;; Examples:
;;          (= (__ 1 4) '(1 2 3))
;;          (= (__ -2 2) '(-2 -1 0 1))
;;          (= (__ 5 8) '(5 6 7))

(defn my-range [l h]
    (loop [coll [] lo l]
      (if (< lo h)
        (recur
          (conj coll lo)
          (inc lo))
        coll)))


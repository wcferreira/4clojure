(ns easy.flatten-sequence)


(def first-input '((1 2) 3 [4 [5 6]]))
(def second-input ["a" ["b"] "c"])
(def third-input '((((:a)))))

;(defn foo [s]
;  (loop [e s]
;    (if (not (sequential? e))
;      e
;      (recur (first e)))))


(defn foo2 [coll]
  (if (sequential? coll)
    ((fn [s]
       (loop [xcoll [] e s]
         (if (not (sequential? e))
           e
           (recur (first e)))))
      coll)
    coll))


(defn flat-seq [s]
  (loop [fseq [] coll s]
    (let [element (first coll)
          value
                (if (sequential? element)
                  ((fn [s]
                     (loop [e s]
                       (if (not (sequential? e))
                         e
                         (recur (first e)))))
                   element)
                  element)]
      (if (empty? coll)
        fseq
        (recur
          (conj fseq value)
          (rest coll))))))







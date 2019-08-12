(ns easy.get-the-caps)

(def example "HeLlO, WoRlD!")

(defn is-upper? [c]
  (and
    (>= (int c) (int \A))
    (<= (int c) (int \Z))))

;(println "CAPS:"
;         (reduce
;           (fn [coll ch]
;             (if (is-upper? ch)
;               (conj coll ch)
;               coll)) [] example))

;(println "CAPS2:"
;         (reduce
;           (fn [coll ch]
;             (if (and (>= (int ch) (int \A))
;                      (<= (int ch) (int \Z)))
;               (conj coll ch)
;               coll)) [] example))


(defn get-caps [s]
  (clojure.string/join ""
     (reduce
       (fn [coll ch]
         (if (and (>= (int ch) (int \A))
                  (<= (int ch) (int \Z)))
           (conj coll ch)
           coll)) [] s)))



;; Other solution
(println (clojure.string/join "" (re-seq #"[A-Z]+" example)))

(ns easy.get-the-caps)

;; Get the Caps
;; Problem: Write a function which takes a string and returns a new string containing only the capital letters.
;; Examples:
;;          (= (__ "HeLlO, WoRlD!") "HLOWRD")
;;          (empty? (__ "nothing"))
;;          (= (__ "$#A(*&987Zf") "AZ")

(defn get-caps [s]
  (clojure.string/join ""
     (reduce
       (fn [coll ch]
         (if (and (>= (int ch) (int \A))
                  (<= (int ch) (int \Z)))
           (conj coll ch)
           coll)) [] s)))

;; Another solution
(println (clojure.string/join "" (re-seq #"[A-Z]+" example)))

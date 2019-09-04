(ns medium.word-sorting)


;(= (__  "Have a nice day.")
;   ["a" "day" "Have" "nice"])
;
;(= (__  "Clojure is a fun language!")
;   ["a" "Clojure" "fun" "is" "language"])
;
;(= (__  "Fools fall for foolish follies.")
;   ["fall" "follies" "foolish" "Fools" "for"])

;;


(defn word-sorting [s]
  (let [mystr (clojure.string/split (subs s 0 (- (count s) 1)) #"\s+")
        sorted-str (sort-by clojure.string/upper-case mystr)]
    sorted-str))
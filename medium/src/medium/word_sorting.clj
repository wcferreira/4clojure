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


(defn mycmp [s1 s2]
  (if (< (compare s1 s2) 0)
    s1
    s2)
  )

(defn foo [mystr]
  (clojure.string/split (subs mystr 0 (- (count mystr) 1)) #"\s+"))
(ns easy.map-construction)

;; Map Construction
;; Problem: Write a function which takes a vector of keys and a vector of values and constructs a map from them.
;; Examples:
;;          (= (__ [:a :b :c] [1 2 3]) {:a 1, :b 2, :c 3})
;;          (= (__ [1 2 3 4] ["one" "two" "three"]) {1 "one", 2 "two", 3 "three"})
;;          (= (__ [:foo :bar] ["foo" "bar" "baz"]) {:foo "foo", :bar "bar"})


(defn create-map [s1 s2]
  (loop [new-map {} col1 s1 col2 s2]
    (if (and (seq col1) (seq col2))
      (recur
        (assoc new-map (first col1) (first col2))
        (rest col1)
        (rest col2))
      new-map)))


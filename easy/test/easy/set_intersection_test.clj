(ns easy.set-intersection-test
  (:require
    [clojure.test          :refer :all]
    [easy.set-intersection :as si]))

(def first-input  {:first #{0 1 2 3}     :second #{2 3 4 5}        :expected #{2 3}})
(def second-input {:first #{0 1 2}       :second #{3 4 5}          :expected #{}})
(def third-input  {:first #{:a :b :c :d} :second #{:c :e :a :f :d} :expected #{:a :c :d}})

(deftest set-intersection-test
  (is (= (si/set-int (:first first-input) (:second first-input)) (:expected first-input)))
  (is (= (si/set-int (:first second-input (:second second-input)) (:expected second-input))))
  (is (= (si/set-int (:first third-input (:second third-input)) (:expected third-input)))))

(ns easy.interpose-seq-test
  (:require
    [clojure.test       :refer :all]
    [easy.interpose-seq :as is]))

(def first-input {:separator 0     :coll [1 2 3]})
(def second-input {:separator ", " :coll ["one" "two" "three"]})
(def third-input {:separator :z    :coll [:a  :b :c :d]} )

(deftest interpose-seq-test
  (is (= (is/interpose-seq (:separator first-input) (:coll first-input)) [1 0 2 0 3]))
  (is (= (is/interpose-seq (:separator second-input) (:coll second-input)) "one, two, three"))
  (is (= (is/interpose-seq (:separator third-input) (:coll third-input)) [:a :z :b :z :c :z :d])))
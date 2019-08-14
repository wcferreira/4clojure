(ns easy.through-the-looking-class)

;; Through the Looking Class
;; Problem:
(let [x java.lang.Class]
  (and (= (class x) x) x))

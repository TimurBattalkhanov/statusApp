# statusApp
Инструкция по запуску проекта

Все файлы манифесты кубернетеса расположены в папке manifest
В корне проекта есть файл nginx-ingress.yaml, необходимый для создания ingress controller

Перед запуском всех манифестов необходимо создать namespace m и установить ingress controller следующим набором команд
kubectl create namespace m && helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx/ && helm repo update && helm install nginx ingress-nginx/ingress-nginx --namespace m -f nginx-ingress.yaml

Затем можно запустить все манифесты одной командой
kubectl apply -f ./manifest/

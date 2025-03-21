PORT_ZAP=8082

docker run --name zap --rm -d -v $(pwd)/out:/owasp/zap \
    -p $PORT_ZAP:$PORT_ZAP \
    -i owasp/zap2docker-stable zap-x.sh \
    -daemon -host 0.0.0.0 -port $PORT_ZAP \
    -config api.disablekey=true -config api.addrs.addr.name=.* -config api.addrs.addr.regex=true -config connection.timeoutInSecs=60

TIMEOUT_OWASP=60
while ! curl -I "http://localhost:$PORT_ZAP" 2>&1 | grep "200" >/dev/null; do
    echo 'Waiting for Owasp ZAP'
    sleep 1
    echo $((TIMEOUT_OWASP--));
    if [ $TIMEOUT_OWASP -le 0 ]; then
    echo "TIMEOUT EXCEDIDO, SALIENDO..."
    exit 1
    fi
done

agregue aqui los comandos necesarios para ejecutar la automatizacion

cd pipeline
npm i
npm run evaluate
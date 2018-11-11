package undertow.min;

import io.undertow.Handlers;
import io.undertow.Undertow;
import io.undertow.UndertowLogger;
import io.undertow.UndertowLogger_$logger;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.protocol.http.HttpRequestParser$$generated;
import io.undertow.util.Headers;
import lombok.val;
import org.xnio.Xnio;
import org.xnio.XnioProvider;
import org.xnio._private.Messages_$logger;
import org.xnio.nio.Log_$logger;
import org.xnio.nio.NioXnioProvider;

import java.util.ArrayList;
import java.util.ServiceLoader;

public class Main {

    static final UndertowLogger logger = UndertowLogger_$logger.CLIENT_LOGGER;

    static final Class<?>[] importedClasses = new Class<?>[]{
        NioXnioProvider.class,
        Messages_$logger.class,
        Log_$logger.class,
        HttpRequestParser$$generated.class,
        Undertow.class
    };

    public static void main( String[] args ){
        logger.info( "Undertow Min: " + importedClasses.length + " special classes kept during shading process" );
        logger.info( "Starting Undertow..." );

        val server = Undertow.builder()
            .addHttpListener(8080, "localhost")
            .setHandler(Main::handleRequest).build();
        server.start();
    }

    private static void handleRequest(final HttpServerExchange exchange) {
        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/plain");
        exchange.getResponseSender().send("Hello World");
    }
}

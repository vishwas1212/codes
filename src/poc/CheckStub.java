package poc;

import org.osgi.framework.Bundle;
import org.osgi.service.component.ComponentContext;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentInstance;

import java.util.Dictionary;

public class CheckStub implements ComponentContext {


    @Override
    public Dictionary<String, Object> getProperties() {
        return null;
    }

    @Override
    public <S> S locateService(String s) {
        return null;
    }

    @Override
    public <S> S locateService(String s, ServiceReference<S> serviceReference) {
        return null;
    }

    @Override
    public Object[] locateServices(String s) {
        return new Object[0];
    }

    @Override
    public BundleContext getBundleContext() {
        return null;
    }

    @Override
    public Bundle getUsingBundle() {
        return null;
    }

    @Override
    public <S> ComponentInstance<S> getComponentInstance() {
        return null;
    }

    @Override
    public void enableComponent(String s) {

    }

    @Override
    public void disableComponent(String s) {

    }

    @Override
    public ServiceReference<?> getServiceReference() {
        return null;
    }
}

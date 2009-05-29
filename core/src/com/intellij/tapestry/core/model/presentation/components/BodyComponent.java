package com.intellij.tapestry.core.model.presentation.components;

import com.intellij.tapestry.core.TapestryProject;
import com.intellij.tapestry.core.exceptions.NotTapestryElementException;
import com.intellij.tapestry.core.java.IJavaClassType;
import com.intellij.tapestry.core.model.presentation.Component;
import com.intellij.tapestry.core.model.presentation.TapestryParameter;

import java.util.HashMap;
import java.util.Map;

/**
 * The built-in Body element.
 */
public class BodyComponent extends Component {

    private static Map<String, TapestryParameter> _parameters = new HashMap<String, TapestryParameter>();

    protected BodyComponent(IJavaClassType componentClass, TapestryProject project) throws NotTapestryElementException {
        super(componentClass, project);
    }

    /**
     * Returns an instance of the Body component.
     *
     * @param tapestryProject the current Tapestry project.
     * @return an instance of the Body component.
     */
    public static BodyComponent getInstance(TapestryProject tapestryProject) {
        return new BodyComponent(tapestryProject.getJavaTypeFinder().findType("org.apache.tapestry5.internal.parser.BodyToken", true), tapestryProject);
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return "body";
    }

    /**
     * {@inheritDoc}
     */
    public Map<String, TapestryParameter> getParameters() {
        return _parameters;
    }

    /**
     * {@inheritDoc}
     */
    protected String getElementNameFromClass(String rootPackage) throws NotTapestryElementException {
        return "body";
    }
}

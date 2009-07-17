package org.drools.reteoo.compiled;

import org.drools.base.ClassFieldReader;
import org.drools.reteoo.AlphaNode;
import org.drools.reteoo.BetaNode;
import org.drools.reteoo.LeftInputAdapterNode;
import org.drools.reteoo.ObjectTypeNode;

/**
 * An abstract adapter class for receiving network node events from the {@link org.drools.reteoo.compiled.ObjectTypeNodeParser}.
 * The methods in this class are empty. This class exists as convenience for creating handler objects.
 * <P>
 * Extend this class to create a <code>NetworkHandler</code> and override the methods for the nodes of interest.
 * (If you implement the {@link NetworkHandler} interface, you have to define all of the methods in it. This
 * abstract class defines null methods for them all, so you can only have to define methods for events you care about.)
 * <P>
 * @see org.drools.reteoo.compiled.NetworkHandler
 * @see org.drools.reteoo.compiled.ObjectTypeNodeParser
 *
 * @author <a href="mailto:stampy88@yahoo.com">dave sinclair</a>
 */
public class NetworkHandlerAdaptor implements NetworkHandler {
    public void startObjectTypeNode(ObjectTypeNode objectTypeNode) {

    }

    public void startNonHashedAlphaNode(AlphaNode alphaNode) {

    }

    public void endNonHashedAlphaNode(AlphaNode alphaNode) {

    }

    public void startBetaNode(BetaNode betaNode) {

    }

    public void endBetaNode(BetaNode betaNode) {

    }

    public void startLeftInputAdapterNode(LeftInputAdapterNode leftInputAdapterNode) {

    }

    public void endLeftInputAdapterNode(LeftInputAdapterNode leftInputAdapterNode) {

    }

    public void startHashedAlphaNodes(ClassFieldReader hashedFieldReader) {

    }

    public void endHashedAlphaNodes(ClassFieldReader hashedFieldReader) {

    }

    public void startHashedAlphaNode(AlphaNode hashedAlpha, Object hashedValue) {

    }

    public void endHashedAlphaNode(AlphaNode hashedAlpha, Object hashedValue) {

    }

    public void endObjectTypeNode(ObjectTypeNode objectTypeNode) {

    }
}
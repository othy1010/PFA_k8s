/**
 */
package k8s.impl;

import java.util.Collection;
import k8s.K8sPackage;
import k8s.NodeSelector;
import k8s.NodeSelectorTerm;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.NodeSelectorImpl#getNodeSelectorTerms <em>Node Selector Terms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeSelectorImpl extends MinimalEObjectImpl.Container implements NodeSelector {
	/**
	 * The cached value of the '{@link #getNodeSelectorTerms() <em>Node Selector Terms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeSelectorTerms()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeSelectorTerm> nodeSelectorTerms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.NODE_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeSelectorTerm> getNodeSelectorTerms() {
		if (nodeSelectorTerms == null) {
			nodeSelectorTerms = new EObjectContainmentEList<NodeSelectorTerm>(NodeSelectorTerm.class, this, K8sPackage.NODE_SELECTOR__NODE_SELECTOR_TERMS);
		}
		return nodeSelectorTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.NODE_SELECTOR__NODE_SELECTOR_TERMS:
				return ((InternalEList<?>)getNodeSelectorTerms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.NODE_SELECTOR__NODE_SELECTOR_TERMS:
				return getNodeSelectorTerms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.NODE_SELECTOR__NODE_SELECTOR_TERMS:
				getNodeSelectorTerms().clear();
				getNodeSelectorTerms().addAll((Collection<? extends NodeSelectorTerm>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case K8sPackage.NODE_SELECTOR__NODE_SELECTOR_TERMS:
				getNodeSelectorTerms().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case K8sPackage.NODE_SELECTOR__NODE_SELECTOR_TERMS:
				return nodeSelectorTerms != null && !nodeSelectorTerms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeSelectorImpl

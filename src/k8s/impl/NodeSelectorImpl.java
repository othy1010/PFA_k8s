/**
 */
package k8s.impl;

import k8s.K8sPackage;
import k8s.NodeSelector;
import k8s.NodeSelectorTerm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * The cached value of the '{@link #getNodeSelectorTerms() <em>Node Selector Terms</em>}' attribute.
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
		return nodeSelectorTerms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeSelectorTerms(EList<NodeSelectorTerm> newNodeSelectorTerms) {
		EList<NodeSelectorTerm> oldNodeSelectorTerms = nodeSelectorTerms;
		nodeSelectorTerms = newNodeSelectorTerms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.NODE_SELECTOR__NODE_SELECTOR_TERMS, oldNodeSelectorTerms, nodeSelectorTerms));
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
				setNodeSelectorTerms((EList<NodeSelectorTerm>)newValue);
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
				setNodeSelectorTerms((EList<NodeSelectorTerm>)null);
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
				return nodeSelectorTerms != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nodeSelectorTerms: ");
		result.append(nodeSelectorTerms);
		result.append(')');
		return result.toString();
	}

} //NodeSelectorImpl

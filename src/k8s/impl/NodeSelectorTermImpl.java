/**
 */
package k8s.impl;

import java.util.Collection;
import k8s.K8sPackage;
import k8s.NodeSelectorRequirement;
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
 * An implementation of the model object '<em><b>Node Selector Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.NodeSelectorTermImpl#getMatchExpressions <em>Match Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeSelectorTermImpl extends MinimalEObjectImpl.Container implements NodeSelectorTerm {
	/**
	 * The cached value of the '{@link #getMatchExpressions() <em>Match Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeSelectorRequirement> matchExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeSelectorTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.NODE_SELECTOR_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeSelectorRequirement> getMatchExpressions() {
		if (matchExpressions == null) {
			matchExpressions = new EObjectContainmentEList<NodeSelectorRequirement>(NodeSelectorRequirement.class, this, K8sPackage.NODE_SELECTOR_TERM__MATCH_EXPRESSIONS);
		}
		return matchExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case K8sPackage.NODE_SELECTOR_TERM__MATCH_EXPRESSIONS:
				return ((InternalEList<?>)getMatchExpressions()).basicRemove(otherEnd, msgs);
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
			case K8sPackage.NODE_SELECTOR_TERM__MATCH_EXPRESSIONS:
				return getMatchExpressions();
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
			case K8sPackage.NODE_SELECTOR_TERM__MATCH_EXPRESSIONS:
				getMatchExpressions().clear();
				getMatchExpressions().addAll((Collection<? extends NodeSelectorRequirement>)newValue);
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
			case K8sPackage.NODE_SELECTOR_TERM__MATCH_EXPRESSIONS:
				getMatchExpressions().clear();
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
			case K8sPackage.NODE_SELECTOR_TERM__MATCH_EXPRESSIONS:
				return matchExpressions != null && !matchExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeSelectorTermImpl

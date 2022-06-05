/**
 */
package k8s.impl;

import k8s.K8sPackage;
import k8s.NodeSelectorRequirement;
import k8s.NodeSelectorTerm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * The cached value of the '{@link #getMatchExpressions() <em>Match Expressions</em>}' attribute.
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
		return matchExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchExpressions(EList<NodeSelectorRequirement> newMatchExpressions) {
		EList<NodeSelectorRequirement> oldMatchExpressions = matchExpressions;
		matchExpressions = newMatchExpressions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.NODE_SELECTOR_TERM__MATCH_EXPRESSIONS, oldMatchExpressions, matchExpressions));
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
				setMatchExpressions((EList<NodeSelectorRequirement>)newValue);
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
				setMatchExpressions((EList<NodeSelectorRequirement>)null);
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
				return matchExpressions != null;
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
		result.append(" (matchExpressions: ");
		result.append(matchExpressions);
		result.append(')');
		return result.toString();
	}

} //NodeSelectorTermImpl

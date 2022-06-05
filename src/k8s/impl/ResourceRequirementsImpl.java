/**
 */
package k8s.impl;

import java.util.Map;

import k8s.K8sPackage;
import k8s.ResourceRequirements;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.ResourceRequirementsImpl#getLimits <em>Limits</em>}</li>
 *   <li>{@link k8s.impl.ResourceRequirementsImpl#getRequests <em>Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceRequirementsImpl extends MinimalEObjectImpl.Container implements ResourceRequirements {
	/**
	 * The cached value of the '{@link #getLimits() <em>Limits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimits()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> limits;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected Map<String, String> requests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.RESOURCE_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getLimits() {
		return limits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimits(Map<String, String> newLimits) {
		Map<String, String> oldLimits = limits;
		limits = newLimits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.RESOURCE_REQUIREMENTS__LIMITS, oldLimits, limits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<String, String> getRequests() {
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequests(Map<String, String> newRequests) {
		Map<String, String> oldRequests = requests;
		requests = newRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS, oldRequests, requests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.RESOURCE_REQUIREMENTS__LIMITS:
				return getLimits();
			case K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				return getRequests();
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
			case K8sPackage.RESOURCE_REQUIREMENTS__LIMITS:
				setLimits((Map<String, String>)newValue);
				return;
			case K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				setRequests((Map<String, String>)newValue);
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
			case K8sPackage.RESOURCE_REQUIREMENTS__LIMITS:
				setLimits((Map<String, String>)null);
				return;
			case K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				setRequests((Map<String, String>)null);
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
			case K8sPackage.RESOURCE_REQUIREMENTS__LIMITS:
				return limits != null;
			case K8sPackage.RESOURCE_REQUIREMENTS__REQUESTS:
				return requests != null;
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
		result.append(" (limits: ");
		result.append(limits);
		result.append(", requests: ");
		result.append(requests);
		result.append(')');
		return result.toString();
	}

} //ResourceRequirementsImpl

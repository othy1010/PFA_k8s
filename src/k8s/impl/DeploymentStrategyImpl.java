/**
 */
package k8s.impl;

import k8s.DeploymentStrategy;
import k8s.K8sPackage;
import k8s.RollingUpdateDeployment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link k8s.impl.DeploymentStrategyImpl#getType <em>Type</em>}</li>
 *   <li>{@link k8s.impl.DeploymentStrategyImpl#getRollingUpdate <em>Rolling Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentStrategyImpl extends MinimalEObjectImpl.Container implements DeploymentStrategy {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRollingUpdate() <em>Rolling Update</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollingUpdate()
	 * @generated
	 * @ordered
	 */
	protected RollingUpdateDeployment rollingUpdate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return K8sPackage.Literals.DEPLOYMENT_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_STRATEGY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollingUpdateDeployment getRollingUpdate() {
		if (rollingUpdate != null && rollingUpdate.eIsProxy()) {
			InternalEObject oldRollingUpdate = (InternalEObject)rollingUpdate;
			rollingUpdate = (RollingUpdateDeployment)eResolveProxy(oldRollingUpdate);
			if (rollingUpdate != oldRollingUpdate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, K8sPackage.DEPLOYMENT_STRATEGY__ROLLING_UPDATE, oldRollingUpdate, rollingUpdate));
			}
		}
		return rollingUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollingUpdateDeployment basicGetRollingUpdate() {
		return rollingUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollingUpdate(RollingUpdateDeployment newRollingUpdate) {
		RollingUpdateDeployment oldRollingUpdate = rollingUpdate;
		rollingUpdate = newRollingUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, K8sPackage.DEPLOYMENT_STRATEGY__ROLLING_UPDATE, oldRollingUpdate, rollingUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case K8sPackage.DEPLOYMENT_STRATEGY__TYPE:
				return getType();
			case K8sPackage.DEPLOYMENT_STRATEGY__ROLLING_UPDATE:
				if (resolve) return getRollingUpdate();
				return basicGetRollingUpdate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case K8sPackage.DEPLOYMENT_STRATEGY__TYPE:
				setType((String)newValue);
				return;
			case K8sPackage.DEPLOYMENT_STRATEGY__ROLLING_UPDATE:
				setRollingUpdate((RollingUpdateDeployment)newValue);
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
			case K8sPackage.DEPLOYMENT_STRATEGY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case K8sPackage.DEPLOYMENT_STRATEGY__ROLLING_UPDATE:
				setRollingUpdate((RollingUpdateDeployment)null);
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
			case K8sPackage.DEPLOYMENT_STRATEGY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case K8sPackage.DEPLOYMENT_STRATEGY__ROLLING_UPDATE:
				return rollingUpdate != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DeploymentStrategyImpl
